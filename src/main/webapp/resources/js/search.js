$(document).ready(function(){
	var repositories; 
	
	$('#page').on('click', '.pageLink', function(){
		console.log($(this).data('url'));
		var uri = $(this).data('url');
		callGitRepoApi(uri);
	});
	
	function parse_link_header(header) {
	    if (header.length === 0) {
	        throw new Error("input must not be of zero length");
	    }

	    // Split parts by comma
	    var parts = header.split(',');
	    var links = {};
	    // Parse each part into a named link
	    for(var i=0; i<parts.length; i++) {
	        var section = parts[i].split(';');
	        if (section.length !== 2) {
	            throw new Error("section could not be split on ';'");
	        }
	        var url = section[0].replace(/<(.*)>/, '$1').trim();
	        var name = section[1].replace(/rel="(.*)"/, '$1').trim();
	        links[name] = url;
	    }
	    return links;
	}
	
	function callGitRepoApi(reqUri){
		$('#msg').empty();
		$('#page').empty();
		$.ajax({
			url:reqUri
		}).done(function(data, textStatus, xhr){
			console.log(xhr.getResponseHeader('Link'));
			if(data.total_count == 0 || data.incomplete_results){
				$('#msg').html("<h2>No Repositories Found</h2>");
			}else{
				repositories = data;
				saveSearchResultThatViewed(repositories);
				outputPageContent();
				var outhtml;
				function outputPageContent(){
					if(repositories.items.length == 0){
						outhtml = '<p>No repos!</p>';
					}else{
						outhtml = '<p><strong>Repos List:</strong></p> <ul>';
						$.each(repositories.items, function(index) {
							outhtml = outhtml + '<li><a href="'+repositories.items[index].html_url+'" target="_blank">'+repositories.items[index].name + '</a></li>';
						});
						outhtml = outhtml + '</ul></div>'; 
					}
					var links = parse_link_header(xhr.getResponseHeader('Link'));
					var pageHtml = '';
					$.each(links,function( index, value ){
						pageHtml = pageHtml + '<a href="#" class="pageLink" id="pagelink'+index+'" data-url="'+value+'" >'+index+' </a> <br/>'; 
						
					});
					
					$('#msg').html(outhtml);
					$('#page').html(pageHtml);
				}
				
				function saveSearchResultThatViewed(searchData){
					
					$.ajax({
						type : "POST",
						contentType : "application/json",
						url : "/postSearchData",
						data : JSON.stringify(searchData),
						dataType : 'json',				
						success : function(data) {
							console.log("data saved" + data);
						}
					});
				}
			}
		})
	}
	
	
	$('#ghsubmitbtn').click(function (e) {
		console.log("test");
		e.preventDefault();
		
		var topic = $('#topic').val();
		var lang = $('#language').val();
		if(!topic && !lang){
			$('#msg').html("<h2>No Repositories Found</h2>");
			return;
		}
		var reqUri;
		if(topic){
			reqUri = 'https://api.github.com/search/repositories?q=topic:'+topic;
			if(lang){
				reqUri = reqUri.concat("+language:"+lang);
			}
		}else if(lang){
			reqUri = 'https://api.github.com/search/repositories?q=language:'+lang;
		}
		
		
		callGitRepoApi(reqUri);
		
		
		
	});
});

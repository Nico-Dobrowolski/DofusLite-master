$(function (){
    var $templates = $('#templates');
    $.ajax({
        type: 'GET',
        url:'/Templates',
            
        success: function(templates){
          $.each(templates, function(i, template) {
            $templates.append('<div class="col-lg-4 col-md-6 mb-md-0 mb-4"> <div class="view overlay rounded z-depth-1"> <a href="/creation?idTemplate='+template.id+'"class="btn btn-dark"><img src="'+template.url+'" class="img-fluid" alt="Sample project image"></a></div><div class="card-body pb-0"><h4 class="font-weight-bold my-3">'+template.classe+'</h4><p class="grey-text">'+template.descrption+'</p></div></div>');
          });
        }
    });
});


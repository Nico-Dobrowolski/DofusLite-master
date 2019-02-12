$(function (){
    
    var $templateOf = $('#templateOf');
    $.ajax({
        type: 'GET',
        url:'/Personnages',
        success: function(personnages){
          $.each(personnages, function(i, personnage) {
            $templateOf.append('<div class="shadow-lg p-3 mb-5 bg-white rounded"><img src="'+personnage.idTemplate.url+'"class="img-fluid"><h4 class="font-weight-bold my-3">'+personnage.idTemplate.nom+'</h4>  <ul class="list-group list-group-flush"> <li  class="list-group-item">' + personnage.idBody.name +'<a> +'+personnage.idBody.health+' vie </a> </li> <li  class="list-group-item">' + personnage.idWeapon.name +'<a> +'+personnage.idWeapon.dmg+' dommage </a></li> <hr> <button type="button" Deleteid='+ personnage.id +' class="remove btn btn-outline-danger">Supprimer</button></ul></div>');
          });
        }
    });
    console.log(templateOf);
    
    $templateOf.delegate('.remove','click', function(){ //lisen any clic on templateOf
      //Creation objet personnage
      var $div = $(this).closest('div');
      $.ajax({
        type : 'DELETE',
        url : '/Personnages/'+ $(this).attr('Deleteid'),
        success: function(){
          $div.remove();
        }
      });     
    });
});



  
  
  
  
  
  
  
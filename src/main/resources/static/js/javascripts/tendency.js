$(function (){
    var $personnages = $('#personnages');
    $.ajax({
        type: 'GET',
        url:'/Templates',
        success: function(personnages){
          $.each(personnages, function(i, personnage) {
            $personnages.append('<div class="card" style="max-width: 250px;"><div class="card-body"><div class="card-body text-center"><h4 class="card-title">'+personnage.nom+'</h4><p class="card-text">'+personnage.descrption+'</p></div></div><img class="img-fluid card-img-bottom" style="max-width: 250px; max-height: 250px;" src="'+personnage.url+'"/><a href="/creation?idTemplate='+personnage.id+'" class="btn btn-primary">Choisir ce personnage</a></div>'
            
            );
          });
        }
    });
});



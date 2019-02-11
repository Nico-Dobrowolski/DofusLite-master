$(function (){
//send data var to view
    var $body = $('#body');
    var $weapons = $('#weapons');
    var $template = $('#template');

//get parma on url
    urlParams = new URLSearchParams(window.location.search);
    var idOfTemplate = urlParams.get('idTemplate');
 //get data var  from view
    
    var $weapons = $('#weapons');
    var $body = $('#body');

    $.ajax({
        
        type: 'GET',
        url:'/Body',
        success: function(body){
            $.each(body, function(i, body) {
                $body.append('<option value='+ body.id +'>' + body.name + '</option>');
            });
        }
    });
    $.ajax({
        type: 'GET',
        url:'/Weapons',
        success: function(weapons){
            $.each(weapons, function(i, weapon) {
                $weapons.append('<option value='+ weapon.id +'>' + weapon.name + '</option>');
            });
        }
    });
    $.ajax({
        type: 'GET',
        url:'/Templates/'+idOfTemplate,
        success: function(template){
            $template.append('<div class="card" style="max-width: 250px;"><div class="card-body text-center"><h4 class="card-title">'+template[0].nom+'</h4></div><img class="img-fluid card-img-bottom" style="max-width: 250px; max-height: 250px;" src="'+template[0].url+'"/></div>' );
          }
    });
   
    $('#addPersonnage').on('click', function(){
//Creation objet personnage
        var jsonPersonnage = 
        {
            "idTemplate":{
                "id": idOfTemplate,
            },	
            "idWeapon":{
                "id": $weapons.val(),
            },
            "idBody":{
                "id": $body.val(),
            }   
        };
        $.ajax({
            type : 'POST',
            url : '/Personnages',
            data : JSON.stringify(jsonPersonnage),
            contentType: "application/json",
            success: function(){
                $.alert("Vous pouvez retrouver votre personnage dans le dashbord", {withTime: false,type: 'success',title:'Création du personnage',icon:'glyphicon glyphicon-heart',minTop: 1});
            },
            error: function(){
                $.alert("Avez vous internet ou rempli tout les champs ? :)", {withTime: false,type: 'danger',title:'Impossible',minTop: 1});
            }
        });

        
    });


});











$(function (){
//send data var to view
    var $body = $('#allbody');
    var $weapons = $('#weapons');
    var $template = $('#template');

//get parma on url
    urlParams = new URLSearchParams(window.location.search);
    $idOfTemplate = urlParams.get('idTemplate');
 //get data var  from view
    console.log($idOfTemplate);


    $.ajax({
        type: 'GET',
        url:'/Body',
        success: function(body){
            $.each(body, function(i, body) {
                $body.append('<option value='+ body.id +'>' + body.name +'<a> +'+body.health+' vie</a></option>'
                );  
            });
        }
    });
    $.ajax({
        type: 'GET',
        url:'/Weapons',
        success: function(weapons){
            $.each(weapons, function(i, weapon) {
                $weapons.append('<option value='+weapon.id+'>'+weapon.name+'<a>+'+weapon.dmg+' dommage</a></option>'
                );
            });
        }
    });
    $.ajax({
        type: 'GET',
        url:'/Templates/'+$idOfTemplate,
        success: function(template){
            $template.append( '<img src="'+template[0].url+'" class="img-fluid"><h4 class="font-weight-bold my-3">'+template[0].nom+'</h4>'
            );
        }
    });
   
    $('#addPersonnage').on('click', function(){
//Creation objet personnage
        console.log("up fct add");
        var jsonPersonnage = 
        {
            "idTemplate":{
                "id": $idOfTemplate,
            },	
            "idWeapon":{
                "id": $weapons.val(),
            },
            "idBody":{
                "id": $body.val(),
            }   
        };
        console.log(jsonPersonnage);
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











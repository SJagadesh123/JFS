$('#btn_hide_show').click(function()
{
    let title = $(this).text(); //to get the text of the button    

    if(title == 'HIDE'){
       $('#btn_hide_show').text('SHOW'); //to change the text of button
       //$('#section_3').slideUp(1000);
    }
    else{
       $(this).text('HIDE');   
       //$('#section_3').slideDown(1000);
    }
    $('#section_3').slideToggle(1000);
})

/*
$('#section_3').click(function(){
    $(this).hide('slow');
})
*/
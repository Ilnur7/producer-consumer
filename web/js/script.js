
$('form').submit(function(e){
    e.preventDefault(); // чтобы не было принудительной отправки формы
    //let msg = $('form').serialize();
    let msg = document.querySelector('#msg').value;
    console.log(msg);
    $.ajax({
        url : 'http://localhost:8083/api/message',
        type : 'POST',
        data : JSON.stringify({message: msg}),
        contentType: "application/json",
    }).done(function() {
      console.log('success');
    }).fail(function() {
      console.log('fail');
    });
});

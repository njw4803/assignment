$(function(){
    $("#userId").keydown(function (key) {
        if (key.keyCode == 13) {
            $("#password").focus();
            return false;
        }
    });

    $("#password").keydown(function (key) {
        if (key.keyCode == 13) {
            loginCheck();
            return false;
        }
    });
});

function loginCheck() {

    var userId = $('#userId').val();
    var password = $('#password').val();

    if (userId == '') {
        var type = 'warning';
        var title_msg = "아이디를 입력해주세요.";
        var msg;
        var id = 'userId';
        sweetAlert(type, title_msg, msg, id); //common.js에 있음
        return false;
    }
    if (password == '') {
        var type = 'warning';
        var title_msg = "비밀번호를 입력해주세요.";
        var msg;
        var id = 'password';
        sweetAlert(type, title_msg, msg, id); //common.js에 있음
        return false;
    }

    login();
}

function login() {

    location.href = '/userListPage';
    return;
    $('#loading').show();

    $.ajax({
        type: "POST",
        data : $("#formData").serialize(),
        url: '/login',
        dataType: "json",
        error: function(result){

        },
        success: function(result){
            // code = 0 로그인 실패 , code = 1 로그인 성공 , code = 2 error
            $('#loading').hide();
            location.href = '/userListPage';

            if (result.code == 0) {

            } else if (result.code == 1) {

            } else if (result.code == 2) {

            }
        }
    });
}
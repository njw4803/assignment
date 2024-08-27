$(function(){
    $("#member_id").keydown(function (key) {
        if (key.keyCode == 13) {
            $("#pwd").focus();
            return false;
        }
    });

    $("#pwd").keydown(function (key) {
        if (key.keyCode == 13) {
            loginChk();
            return false;
        }
    });
});

function loginCheck() {

    var member_id = $('#member_id').val();
    var pwd = $('#pwd').val();

    if (member_id == '') {
        var type = 'warning';
        var title_msg = "아이디를 입력해주세요.";
        var msg;
        var id = 'member_id';
        sweetAlert(type, title_msg, msg, id); //common.js에 있음
        return false;
    }
    if (pwd == '') {
        var type = 'warning';
        var title_msg = "비밀번호를 입력해주세요.";
        var msg;
        var id = 'pwd';
        sweetAlert(type, title_msg, msg, id); //common.js에 있음
        return false;
    }

    login();
}

function login() {

    $('#loading').show();
    return;
    $.ajax({
        type: "POST",
        data : $("#formData").serialize(),
        url: 'login',
        dataType: "json",
        error: function(result){

        },
        success: function(result){
            // code = 0 로그인 실패 , code = 1 로그인 성공 , code = 2 error
            $('#loading').hide();
            if (result.code == 0) {

            } else if (result.code == 1) {

            } else if (result.code == 2) {

            }
        }
    });
}
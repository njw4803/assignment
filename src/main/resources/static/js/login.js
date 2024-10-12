$(function(){
    $("#id").keydown(function (key) {
        if (key.keyCode == 13) {
            let password = $('#password').val();
            if (password === '') {
                $("#password").focus();
                return;
            }
            loginCheck();
            return;
        }
    });

    $("#password").keydown(function (key) {
        if (key.keyCode == 13) {
            loginCheck();
            return;
        }
    });
});

function loginCheck() {

    let id = $('#id').val();
    let password = $('#password').val();

    if (id === '') {
        document.getElementById('error').innerText = '아이디를 입력해주세요.';
        return;
    }
    if (password === '') {
        document.getElementById('error').innerText = '비밀번호를 입력해주세요.';
        return;
    }

    login();
}

function login() {

    $('#loading').show();

    $.ajax({
        type: "POST",
        data : JSON.stringify({
            id: $('#id').val(),
            password: $('#password').val()
        }),
        url: '/login',
        contentType: "application/json",
        error: function(result) {

        },
        success: function(result) {
            location.href = '/userListPage';

        },
        complete: function () {
            $('#loading').hide();
        }
    });
}
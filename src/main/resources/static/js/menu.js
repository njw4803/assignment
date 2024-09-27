$(function(){
    document.getElementById("userListPage").addEventListener('click',getPage);
    document.getElementById("boardListPage").addEventListener('click',getPage);
    document.getElementById("salesInquiryPage").addEventListener('click',getPage);

    const profilePic = document.getElementById('profile-pic');
    const dropdownMenu = document.getElementById('dropdown-menu');
    const profileModal = document.getElementById('profile-modal');
    const closeModal = document.getElementById('close-modal');
    const viewProfile = document.getElementById('view-profile');
    const fileInput = document.getElementById('file-input');
    const changeProfileButton = document.getElementById('change-profile-button');

// 프로필 이미지 클릭 시 드롭다운 메뉴 토글
    profilePic.addEventListener('click', function() {
        dropdownMenu.style.display = dropdownMenu.style.display === 'none' || dropdownMenu.style.display === ''
            ? 'block'
            : 'none';
    });


// 메뉴 이외의 영역 클릭 시 드롭다운 닫기
    document.addEventListener('click', function(event) {
        if (!profilePic.contains(event.target) && !dropdownMenu.contains(event.target)) {
            dropdownMenu.style.display = 'none';
        }
    });

// "프로필 보기" 클릭 시 모달 열기
    viewProfile.addEventListener('click', function(event) {
        event.preventDefault(); // 기본 동작 방지
        profileModal.style.display = 'block';
    });

// 모달 닫기
    closeModal.addEventListener('click', function() {
        profileModal.style.display = 'none';
    });

// 모달 밖을 클릭하면 모달 닫기
    window.addEventListener('click', function(event) {
        if (event.target === profileModal) {
            profileModal.style.display = 'none';
        }
    });

// "프로필 변경" 버튼 클릭 시 파일 첨부 입력창 열기
    changeProfileButton.addEventListener('click', function() {
        fileInput.click();  // 파일 선택 창 열기
    });


// 파일 선택 시 새로운 프로필 이미지 미리보기 설정
    fileInput.addEventListener('change', function(event) {
        const file = event.target.files[0];
        if (file) {
            const reader = new FileReader();
            reader.onload = function(e) {
                document.getElementById('profile-pic-large').src = e.target.result;  // 모달의 이미지 변경
                document.getElementById('profile-pic').src = e.target.result;  // 헤더의 프로필 이미지 변경
            };
            reader.readAsDataURL(file);  // 선택한 파일 읽기
        }
    });

});

function getPage() {
    location.href = this.id;
}
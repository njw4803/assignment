$(function(){
    document.getElementById("userListPage").addEventListener('click',getPage);
    document.getElementById("boardListPage").addEventListener('click',getPage);
    document.getElementById("salesInquiryPage").addEventListener('click',getPage);
});

function getPage() {
    location.href = this.id;
}
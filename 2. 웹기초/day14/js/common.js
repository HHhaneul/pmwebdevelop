
window.addEventListener("DOMContentLoaded", function(){
    const openBtn = document.getElementById("openBtn");
    openBtn.addEventListener("click", function(){
        //window.open
        const win = open("ex02.html", "winPop", "width=500, height=500");    
        console.log(win);

        // 창 닫기
        const closeBtn = document.getElementById("closeBtn");
        closeBtn.addEventListener("click", function(){
            wind.close();
        });
    });

});
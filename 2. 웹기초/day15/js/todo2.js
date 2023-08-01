const todoApp = {
    /**
     * 스케줄 추가
     * 
     */
    intsert(){
        try{
            const todo = frm.todo.value.trim(); 
            if(!todo){ // todo를 입력하지 않은 경우
                throw new Error("할 일을 입력하세요.");
            }

            const todos = document.getElementById("todos");
            
            const tpl = document.getElementById("tpl");
            let data = tpl.innerHTML;
            data = data.replace(/#\[todo\]/g, todo);
            
            const domParser = new DOMParser();
            const dom = domParser.parseFromString(data, "text/html");
            const li = dom.querySelector("li");
            
            todos.appendChild(li);
            frm.todo.value = "";
            frm.todo.focus();
            
            /** 삭제 클릭 처리 */
            const remove = li.querySelector(".remove");
            remove.addEventListener("click", todoApp.delete);

        }catch(err){
            alert(err.message);
        }
    },
    delete(){
        if(!confirm("정말 삭제하겠습니까?")){
            // 삭제 취소를 클랙 했을 때
            return;
        }
    
        // 확인을 클릭 했을 때 -> 삭제 진행

        //this: 이벤트가 발생한 요소
        const li = this.parentElement;
        // ul
        li.parentElement.removeChild(li);
    }
};

window.addEventListener("DOMContentLoaded", function(){
    // 스케줄 추가 처리
    const register = document.getElementById("register");
    register.addEventListener("click", todoApp.intsert);

});
var Module = (function() {
    return {
        getName: function(name){
            //var name = document.getElementById("nameJs").value;
            var url = '/hello?name=' + name;
            fetch(url, {
                method: 'GET'
            })
                .then(response => response.text())
                .then(res => document.getElementById("Resultado").innerHTML = res)
                
        },

        getNameByPost: function(){
            var name = document.getElementById("name").value;
            var url = '/hello_2?name=' + name;
            fetch(url, {
                method: 'POST'
            })
                .then(response => response.text())
                .then(res => document.getElementById("Resultado_2").innerHTML = res)
            
        }
    }
})();
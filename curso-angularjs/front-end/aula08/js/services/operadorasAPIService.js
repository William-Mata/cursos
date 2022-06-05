angular.module("ListaTelefonica").factory("operadorasApi", ($http) => {

     var _getOperadoras =  () => {
        return $http.get("https://localhost:7093/api/Operadoras");
    }
    
    return {
        getOperadoras: _getOperadoras 
    }
    
});
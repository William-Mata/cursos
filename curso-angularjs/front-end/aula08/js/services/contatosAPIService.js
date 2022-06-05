angular.module("ListaTelefonica").factory("contatosApi", ($http, config) => {
    var _getContatos =  () => {
        return $http.get(config.baseUrl + "contatos");
    }

    var _postContato = (contato) => {
        return $http.post(config.baseUrl + "contatos/", contato);
    }

    var _removeContato = (contato) => {
        return $http.delete(config.baseUrl + "contatos/" + contato.id);
    }

    return {
        getContatos: _getContatos,
        postContato: _postContato,
        removeContato : _removeContato
    };
});
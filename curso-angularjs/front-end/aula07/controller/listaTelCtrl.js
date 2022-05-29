angular.module('ListaTelefonica').controller('ListaTelefonicaCtrl', function ($scope, $filter, $http) {
    $scope.title = "Lista Telefonica";
    $scope.listaTel = [];

    // PEGA TODOS OS CONTATOS
    $scope.listaContatos = () => {
        $http({
            method: 'GET',
            url: 'https://localhost:7093/api/contatos'
        }).then((response) => {
            response.data.map((item) => {
                $scope.listaTel.push(item);
            })
        })
    };
    $scope.listaContatos();

    // CADASTRA UM CONTATO
    $scope.cadastrarContato = (contato) => {
        contato.dataCadastro = new Date();
        contato.cor = "black";
        $http({
            method: 'POST',
            url: 'https://localhost:7093/api/contatos/',
            data: contato

        }).then((respon) => {
            $scope.listaTel.push(contato);
            delete $scope.contato;
            $scope.contatoForm.$setPristine();

        })
    };

    // DELETA UM CONTATO
    $scope.apagarContato = () => {
        $scope.listaTel.map((contato) => {
            if (contato.selecionado) {
                $http({
                    method: 'DELETE',
                    url: 'https://localhost:7093/api/contatos/' + contato.id
                }).then((response) => {
                    $scope.listaTel.pop(contato);
                    delete $scope.contato;
                    $scope.contatoForm.$setPristine();
                })
            }
        })
    }


    $scope.operadoras = [
        { nome: "OI", categoria: "FIXO", valor: 2 },
        { nome: "GVT", categoria: "FIXO", valor: 0.25 },
        { nome: "TIM", categoria: "CELULAR", valor: 1.50 },
        { nome: "VIVO", categoria: "CELULAR", valor: 1 },
        { nome: "NEXTEL", categoria: "CELULAR", valor: 0.75 },
        { nome: "CLARO", categoria: "CELULAR", valor: 0.50 }
    ]



    // VERIFICAR SE A ALGUM MARCADO PARA ALTERAR OU APAGAR
    $scope.isContatoSelecionado = function (contatosSelecionado) {
        console.log(contatosSelecionado);
        if (contatosSelecionado != null) {
            return contatosSelecionado.some((contato) => {
                return contato.selecionado;
            })
        }
    }

    $scope.buscar = function (filtro) {
        $scope.filtro = filtro;
    }

    $scope.ordernarPor = function (ordem) {
        $scope.ordem = ordem;
        $scope.direcao = !$scope.direcao;
    }

    $scope.classe1 = "selecionado";
    $scope.classe2 = "negrito";
    $scope.ativo = false;

});
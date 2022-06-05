angular.module("ListaTelefonica").config(function (serialGeneratorProvider)  {
    serialGeneratorProvider.setLength(100);
    console.log(serialGeneratorProvider.getLength());
})
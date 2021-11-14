let amigo = {
    nome: 'William',
    sexo: 'M',
    peso: 60.0,
    engordar(p = 0) {
        this.peso += p
    }
}
amigo.engordar(5)
console.log(`${amigo.nome} pesa ${amigo.peso}Kg`)
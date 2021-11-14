var agora = new Date()
var diasemana = agora.getDay()
    /*
        0 = Domingo / Sunday
        1 = Segunda / Monday
        2 = Terça   /Tuesday
        3 = Quarta  /Wednesday
        4 = Quinta  /Thursday
        5 = Sexta   /Friday
        6 = Sábado  /Saturday 
    */
console.log(diasemana)

switch (diasemana) {
    case 0:
        console.log('Domingo / Sunday')
        break
    case 1:
        console.log('Segunda / Monday')
        break
    case 2:
        console.log('Terça / Tuesday')
        break
    case 3:
        console.log('Quarta / Wednesday')
        break
    case 4:
        console.log('Quinta / Thursday')
        break
    case 5:
        console.log('Sexta / Friday')
        break
    case 6:
        console.log('Sábado / Saturday')
        break
    default:
        console.log('[ERRO] Dia invalido / Day Invalid')
        break
}
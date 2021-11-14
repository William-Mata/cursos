function tabuadas() {
    var tabuada = window.document.getElementById('multiplicar')
    var tabuada = Number(tabuada.value)
    var selectprenchimento = window.document.querySelector('select#tabuada')
    var multiplicador = 1
    selectprenchimento.innerHTML = ``

    while (multiplicador <= 10) {
        var resultadotab = window.document.createElement('option')
        resultadotab.text = `${tabuada} X ${multiplicador} = ${tabuada*multiplicador}`
        selectprenchimento.appendChild(resultadotab)
        multiplicador++
    }
}
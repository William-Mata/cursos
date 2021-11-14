let valores = [12, 30, 9, 8, 25, 18, 19, 97, 21]
valores.sort()

for (var contar = 0; contar < valores.length; contar++) {
    console.log(valores[contar])
}
console.log('')
for (let contar in valores) {
    console.log(valores[contar])
}
function jogar(jogador) {
    let opcoes = ["pedra", "papel", "tesoura"];
    let computador = opcoes[Math.floor(Math.random() * 3)];

    let resultado = "";

    if (jogador === computador) {
        resultado = "Empate! Ambos escolheram " + jogador;
    } 
    else if (
        (jogador === "pedra" && computador === "tesoura") ||
        (jogador === "papel" && computador === "pedra") ||
        (jogador === "tesoura" && computador === "papel")
    ) {
        resultado = "Parabéns, você ganhou! " + jogador + " ganha de " + computador;
    } 
    else {
        resultado = "Péssimo, você perdeu! " + computador + " ganha de " + jogador;
    }

    document.getElementById("resultado").innerText = resultado;
}

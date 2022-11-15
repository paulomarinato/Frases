package com.criandoapps.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void novaFrase (View view){
        String [] frases = {
                "Sempre existe espaço para fazer tudo o que lhe é do teu interesse. Resta a você escolher as tuas prioridades",
                "O guerreiro que ora nunca ganhará do guerreiro que ora e treina",
                "Se ainda venta, não adianta varrer. Espere o momento certo para agir",
                "É em meio a dificuldade que se encontra a oportunidade",
                "O êxito é ir de frustração a frustração sem perder a animação",
                "Mesmo que algo pareça difícil, nunca desista antes de tentar",
                "Você é o único que entende as suas dificuldades, por isso motive se a prosseguir",
                "Não é uma vida ruim, é apenas um dia ruim, lembre-se disso",
                "A maior prova de que você pode fazer o impossível, é superar circunstâncias difíceis",
                "Que os dias bons se tornem rotina, e os ruins se tornem raros",
                "É genial celebrar a vitória, contudo é mais significativo aprender com as lições da derrota",
                "Qualquer dificuldade pode ser ultrapassada, já que para todo problema há uma solução",
                "Já pensou que você já superou muitas dificuldades até aqui?",
                "Suas pequenas vitórias são todas as dificuldades superadas durante sua vida, tenha orgulho delas",
                "Cada dificuldade ultrapassada te faz mais forte",
                "Desistir não deve ser considerado, mesmo que as coisas não sejam fáceis",
                "O êxito é a somatória dos pequenos esforços repetidos diariamente",
                "Para quem está iluminado, os dias de luz sempre retornam",
                "Conheci o pior das pessoas e o melhor de mim, passando por tempos difíceis",
                "Você não vai encontrar ninguém para sorrir por ti, então não deixe de sorrir",
                "Mesmo que nem todo dia seja bom, há algo de bom todo dia",
                "Em dias difíceis, lembre-se do que Deus já fez por ti. Recorde o que pode te oferecer esperança",
                "Da mesma forma que a felicidade não dura para sempre, a tristeza também não",
                "As dores não são eternas, se permita, o seu melhor é o suficiente",
                "Mesmo que a jornada seja lenta, abrir mão não acelera",
                "Que a expectativa por dias melhores nunca nos falte",
                "Você é maior do que toda essa tormenta, seja resiliente",
                "A vida é um eterno recomeço",
                "O fruto do que você escolher hoje, é o que você viverá amanhã",
                "Ser uma pessoa melhor é o objetivo do dia",
                "Se nada der certo hoje, acorde mais cedo amanhã e tente novamente",
                "Você nunca irá fazer nada, se ficar esperando pelas situações perfeitas",
                "O futuro ainda não chegou, seja grato pelo agora",
                "Para chegar em lugares maravilhosos, é necessário passar por caminhos difíceis",
                "As estrelas mais brilhantes são produzidas nas noites mais escuras",
                "A diferença entre os dias ruins e bons, é que um ensina e o outro marca",
                "A superação da dificuldade depende apenas de você",
                "Se não está feliz com algo, mexa se!",
                "Mesmo que a conquista venha apenas às vezes, não deixe de lutar",
                "Está na hora de deixar o passado no lugar dele e seguir em frente",
                "Superação é esquecer o ontem para um amanhã melhor e promitente",
                "Domine os seus medos!",
                "Você não chegou até aqui por acaso, para tudo existe uma razão. Continue em frente",
                "Você terá possibilidade de ganhar, enquanto tiver força para lutar",
                "Seus medos morrerão de fome, se alimentar a sua motivação",
                "Vencer momentos difíceis pede esforço, entretanto todos somos capacitados para isso, recomeçar e escolher um novo caminho",
                "Problemas não são barreiras, mas chances de ímpares de superação e desenvolvimento",
                "Você só será vencedor se lutar hoje e sempre, que os fracassos da vida não sejam motivo para tristeza",
                "Diversas coisas me fizeram sofrer, entretanto elas somente precisavam acontecer para me fazer crescer",
                "Deus é muito maior que tudo isso e ele esta comigo"
        };
        int geraFrases = new Random().nextInt(49);

        TextView texto = findViewById(R.id.fraseSelecionada);
        texto.setText( frases[ geraFrases] );

    }
}
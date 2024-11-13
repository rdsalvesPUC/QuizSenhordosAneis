package com.example.quizsenhordosaneis.quiz

import com.example.quizsenhordosaneis.model.Pergunta
import com.example.quizsenhordosaneis.model.Quiz

object QuizData {
    val quizzes = listOf(
        Quiz(
            id = "quiz_1",
            perguntas = listOf(
                Pergunta(
                    id = "1",
                    texto = "Quem forjou o Um Anel?",
                    opcoes = listOf("Sauron", "Gandalf", "Frodo", "Saruman").shuffled(),
                    respostaCorreta = "Sauron",
                    imagem = "quiz_1_1"
                ),
                Pergunta(
                    id = "2",
                    texto = "Qual o nome da cidade dos elfos liderada por Galadriel?",
                    opcoes = listOf("Rohan", "Mordor", "Lothlórien", "Gondor").shuffled(),
                    respostaCorreta = "Lothlórien",
                    imagem = "quiz_1_2"
                ),
                Pergunta(
                    id = "3",
                    texto = "Qual o nome da espada de Aragorn?",
                    opcoes = listOf("Narsil", "Sting", "Andúril", "Glamdring").shuffled(),
                    respostaCorreta = "Andúril",
                    imagem = "quiz_1_3"
                ),
                Pergunta(
                    id = "4",
                    texto = "Qual criatura transportou Frodo até o Monte da Perdição?",
                    opcoes = listOf("Balrog", "Águia", "Dragão", "Nazgûl").shuffled(),
                    respostaCorreta = "Águia",
                    imagem = "quiz_1_4"
                ),
                Pergunta(
                    id = "5",
                    texto = "Quem é o pai de Legolas?",
                    opcoes = listOf("Elrond", "Thranduil", "Celeborn", "Gil-galad").shuffled(),
                    respostaCorreta = "Thranduil",
                    imagem = "quiz_1_5"
                ),
                Pergunta(
                    id = "6",
                    texto = "Qual é o nome da capital de Gondor?",
                    opcoes = listOf("Edoras", "Minas Tirith", "Helm’s Deep", "Isengard").shuffled(),
                    respostaCorreta = "Minas Tirith",
                    imagem = "quiz_1_6"
                ),
                Pergunta(
                    id = "7",
                    texto = "Qual era o nome original de Gollum?",
                    opcoes = listOf("Deagol", "Eomer", "Smeagol", "Saruman").shuffled(),
                    respostaCorreta = "Smeagol",
                    imagem = "quiz_1_7"
                ),
                Pergunta(
                    id = "8",
                    texto = "Quem é o Senhor de Mordor?",
                    opcoes = listOf("Saruman", "Sauron", "Gandalf", "Frodo").shuffled(),
                    respostaCorreta = "Sauron",
                    imagem = "quiz_1_8"
                ),
                Pergunta(
                    id = "9",
                    texto = "Quantos membros formam a Sociedade do Anel?",
                    opcoes = listOf("5", "7", "9", "11").shuffled(),
                    respostaCorreta = "9",
                    imagem = "quiz_1_9"
                ),
                Pergunta(
                    id = "10",
                    texto = "Quem mata o Rei Bruxo de Angmar?",
                    opcoes = listOf("Aragorn", "Gimli", "Eowyn", "Frodo").shuffled(),
                    respostaCorreta = "Eowyn",
                    imagem = "quiz_1_10"
                )
            )
        ),
        Quiz(
            id = "quiz_2",
            perguntas = listOf(
                Pergunta(
                    id = "1",
                    texto = "Qual hobbit se voluntaria para destruir o Anel?",
                    opcoes = listOf("Frodo", "Sam", "Bilbo", "Pippin").shuffled(),
                    respostaCorreta = "Frodo",
                    imagem = "quiz_2_1"
                ),
                Pergunta(
                    id = "2",
                    texto = "Qual é o verdadeiro nome de Gandalf?",
                    opcoes = listOf("Olórin", "Mithrandir", "Curunír", "Saruman").shuffled(),
                    respostaCorreta = "Olórin",
                    imagem = "quiz_2_2"
                ),
                Pergunta(
                    id = "3",
                    texto = "Quem encontra o Um Anel após Gollum perdê-lo?",
                    opcoes = listOf("Bilbo", "Frodo", "Sam", "Saruman").shuffled(),
                    respostaCorreta = "Bilbo",
                    imagem = "quiz_2_3"
                ),
                Pergunta(
                    id = "4",
                    texto = "Qual é o nome do cavalo de Gandalf?",
                    opcoes = listOf("Brego", "Rochallor", "Asfaloth", "Scadufax").shuffled(),
                    respostaCorreta = "Scadufax",
                    imagem = "quiz_2_4"
                ),
                Pergunta(
                    id = "5",
                    texto = "Qual é o nome da filha de Elrond?",
                    opcoes = listOf("Galadriel", "Arwen", "Éowyn", "Lúthien").shuffled(),
                    respostaCorreta = "Arwen",
                    imagem = "quiz_2_5"
                ),
                Pergunta(
                    id = "6",
                    texto = "Onde fica a Montanha da Perdição?",
                    opcoes = listOf("Gondor", "Rohan", "Mordor", "Shire").shuffled(),
                    respostaCorreta = "Mordor",
                    imagem = "quiz_2_6"
                ),
                Pergunta(
                    id = "7",
                    texto = "Quem destruiu a entrada de Moria?",
                    opcoes = listOf("Frodo", "Legolas", "Balrog", "Sauron").shuffled(),
                    respostaCorreta = "Balrog",
                    imagem = "quiz_2_7"
                ),
                Pergunta(
                    id = "8",
                    texto = "O que Gollum chamava o Um Anel?",
                    opcoes = listOf("Seu presente", "Meu precioso", "O anel", "O poder").shuffled(),
                    respostaCorreta = "Meu precioso",
                    imagem = "quiz_2_8"
                ),
                Pergunta(
                    id = "9",
                    texto = "Quem destruiu o Anel?",
                    opcoes = listOf("Frodo", "Sam", "Gollum", "Sauron").shuffled(),
                    respostaCorreta = "Gollum",
                    imagem = "quiz_2_9"
                ),
                Pergunta(
                    id = "10",
                    texto = "O que Aragorn se torna no final da história?",
                    opcoes = listOf("Rei de Gondor", "Mago", "Elfo", "Hobbit").shuffled(),
                    respostaCorreta = "Rei de Gondor",
                    imagem = "quiz_2_10"
                )
            )
        ),
        Quiz(
            id = "quiz_3",
            perguntas = listOf(
                Pergunta(
                    id = "1",
                    texto = "Qual é o nome do anel que Frodo carrega?",
                    opcoes = listOf("Um Anel", "Anel do Poder", "Anel de Fogo", "Anel de Mithril").shuffled(),
                    respostaCorreta = "Um Anel",
                    imagem = "quiz_3_1"
                ),
                Pergunta(
                    id = "2",
                    texto = "Quem era o melhor amigo de Frodo e acompanhou-o até Mordor?",
                    opcoes = listOf("Sam", "Pippin", "Merry", "Gandalf").shuffled(),
                    respostaCorreta = "Sam",
                    imagem = "quiz_3_2"
                ),
                Pergunta(
                    id = "3",
                    texto = "Qual o nome da montanha onde o Um Anel foi forjado?",
                    opcoes = listOf("Monte Caradhras", "Montanha da Perdição", "Monte Dol Guldur", "Montanha de Mordor").shuffled(),
                    respostaCorreta = "Montanha da Perdição",
                    imagem = "quiz_3_3"
                ),
                Pergunta(
                    id = "4",
                    texto = "Quem é o líder dos Nazgûl?",
                    opcoes = listOf("Rei Bruxo de Angmar", "Saruman", "Sauron", "Gollum").shuffled(),
                    respostaCorreta = "Rei Bruxo de Angmar",
                    imagem = "quiz_3_4"
                ),
                Pergunta(
                    id = "5",
                    texto = "Qual é o nome do reino onde vive Arwen?",
                    opcoes = listOf("Rohan", "Gondor", "Valfenda", "Mordor").shuffled(),
                    respostaCorreta = "Valfenda",
                    imagem = "quiz_3_5"
                ),
                Pergunta(
                    id = "6",
                    texto = "Quem lidera o reino de Rohan?",
                    opcoes = listOf("Théoden", "Aragorn", "Gandalf", "Boromir").shuffled(),
                    respostaCorreta = "Théoden",
                    imagem = "quiz_3_6"
                ),
                Pergunta(
                    id = "7",
                    texto = "Quem ajudou Frodo a chegar ao Monte da Perdição?",
                    opcoes = listOf("Gollum", "Sam", "Gandalf", "Aragorn").shuffled(),
                    respostaCorreta = "Sam",
                    imagem = "quiz_3_7"
                ),
                Pergunta(
                    id = "8",
                    texto = "Qual era o nome do guardião da floresta Fangorn?",
                    opcoes = listOf("Treebeard", "Legolas", "Thranduil", "Beorn").shuffled(),
                    respostaCorreta = "Treebeard",
                    imagem = "quiz_3_8"
                ),
                Pergunta(
                    id = "9",
                    texto = "Quem ajudou Frodo a escapar dos Espectros do Anel em Valfenda?",
                    opcoes = listOf("Arwen", "Elrond", "Gandalf", "Aragorn").shuffled(),
                    respostaCorreta = "Arwen",
                    imagem = "quiz_3_9"
                ),
                Pergunta(
                    id = "10",
                    texto = "Qual é o verdadeiro nome de Sauron?",
                    opcoes = listOf("Mairon", "Curumo", "Aulë", "Ilúvatar").shuffled(),
                    respostaCorreta = "Mairon",
                    imagem = "quiz_3_10"
                )
            )
        ),
        Quiz(
            id = "quiz_4",
            perguntas = listOf(
                Pergunta(
                    id = "1",
                    texto = "Qual é o nome do Hobbit que encontra o Um Anel antes de Frodo?",
                    opcoes = listOf("Bilbo", "Sam", "Gollum", "Pippin").shuffled(),
                    respostaCorreta = "Bilbo",
                    imagem = "quiz_4_1"
                ),
                Pergunta(
                    id = "2",
                    texto = "Qual é o nome do reino governado por Sauron?",
                    opcoes = listOf("Mordor", "Gondor", "Rohan", "Valfenda").shuffled(),
                    respostaCorreta = "Mordor",
                    imagem = "quiz_4_2"
                ),
                Pergunta(
                    id = "3",
                    texto = "Quem destrói o Anel de Sauron?",
                    opcoes = listOf("Frodo", "Sam", "Gollum", "Aragorn").shuffled(),
                    respostaCorreta = "Gollum",
                    imagem = "quiz_4_3"
                ),
                Pergunta(
                    id = "4",
                    texto = "Qual é o nome do mago que se torna maligno e ajuda Sauron?",
                    opcoes = listOf("Saruman", "Gandalf", "Radagast", "Mithrandir").shuffled(),
                    respostaCorreta = "Saruman",
                    imagem = "quiz_4_4"
                ),
                Pergunta(
                    id = "5",
                    texto = "Quem é o pai de Aragorn?",
                    opcoes = listOf("Arathorn", "Isildur", "Elendil", "Théoden").shuffled(),
                    respostaCorreta = "Arathorn",
                    imagem = "quiz_4_5"
                ),
                Pergunta(
                    id = "6",
                    texto = "Qual o nome da montanha onde o Anel foi destruído?",
                    opcoes = listOf("Montanha da Perdição", "Monte Dolmed", "Caradhras", "Thangorodrim").shuffled(),
                    respostaCorreta = "Montanha da Perdição",
                    imagem = "quiz_4_6"
                ),
                Pergunta(
                    id = "7",
                    texto = "Quem destrói Isengard e derrota Saruman?",
                    opcoes = listOf("Os Ents", "Elfos", "Gondorianos", "Rohirrim").shuffled(),
                    respostaCorreta = "Os Ents",
                    imagem = "quiz_4_7"
                ),
                Pergunta(
                    id = "8",
                    texto = "Qual é o nome do dragão que ataca o Reino dos Anões?",
                    opcoes = listOf("Smaug", "Ancalagon", "Glaurung", "Scatha").shuffled(),
                    respostaCorreta = "Smaug",
                    imagem = "quiz_4_8"
                ),
                Pergunta(
                    id = "9",
                    texto = "Quem é o primeiro portador do Um Anel?",
                    opcoes = listOf("Sauron", "Isildur", "Elrond", "Gollum").shuffled(),
                    respostaCorreta = "Sauron",
                    imagem = "quiz_4_9"
                ),
                Pergunta(
                    id = "10",
                    texto = "Qual é o nome da fortaleza de Sauron em Mordor?",
                    opcoes = listOf("Barad-dûr", "Minas Morgul", "Orthanc", "Dol Guldur").shuffled(),
                    respostaCorreta = "Barad-dûr",
                    imagem = "quiz_4_10"
                )
            )
        ),
        Quiz(
            id = "quiz_5",
            perguntas = listOf(
                Pergunta(
                    id = "1",
                    texto = "Qual o nome do lugar onde Frodo vive?",
                    opcoes = listOf("Condado", "Rohan", "Gondor", "Mordor").shuffled(),
                    respostaCorreta = "Condado",
                    imagem = "quiz_5_1"
                ),
                Pergunta(
                    id = "2",
                    texto = "Quem é conhecido como o Senhor do Escuro?",
                    opcoes = listOf("Sauron", "Saruman", "Gandalf", "Théoden").shuffled(),
                    respostaCorreta = "Sauron",
                    imagem = "quiz_5_2"
                ),
                Pergunta(
                    id = "3",
                    texto = "Qual é o nome do Elfo que faz parte da Sociedade do Anel?",
                    opcoes = listOf("Legolas", "Thranduil", "Elrond", "Galadriel").shuffled(),
                    respostaCorreta = "Legolas",
                    imagem = "quiz_5_3"
                ),
                Pergunta(
                    id = "4",
                    texto = "Quem herda o Um Anel após a morte de Isildur?",
                    opcoes = listOf("Gollum", "Frodo", "Bilbo", "Ninguém").shuffled(),
                    respostaCorreta = "Gollum",
                    imagem = "quiz_5_4"
                ),
                Pergunta(
                    id = "5",
                    texto = "Quem é o principal antagonista na trilogia O Senhor dos Anéis?",
                    opcoes = listOf("Sauron", "Saruman", "Gollum", "Gandalf").shuffled(),
                    respostaCorreta = "Sauron",
                    imagem = "quiz_5_5"
                ),
                Pergunta(
                    id = "6",
                    texto = "Qual é o nome do portador do Um Anel que viveu por mais de 500 anos?",
                    opcoes = listOf("Gollum", "Bilbo", "Frodo", "Sam").shuffled(),
                    respostaCorreta = "Gollum",
                    imagem = "quiz_5_6"
                ),
                Pergunta(
                    id = "7",
                    texto = "Qual o nome do mago que se torna o Branco após derrotar o Balrog?",
                    opcoes = listOf("Gandalf", "Saruman", "Radagast", "Elrond").shuffled(),
                    respostaCorreta = "Gandalf",
                    imagem = "quiz_5_7"
                ),
                Pergunta(
                    id = "8",
                    texto = "Quem é o Rei que retorna para reclamar o trono de Gondor?",
                    opcoes = listOf("Aragorn", "Boromir", "Faramir", "Théoden").shuffled(),
                    respostaCorreta = "Aragorn",
                    imagem = "quiz_5_8"
                ),
                Pergunta(
                    id = "9",
                    texto = "Qual o nome da espada quebrada que pertence a Aragorn?",
                    opcoes = listOf("Narsil", "Andúril", "Glamdring", "Sting").shuffled(),
                    respostaCorreta = "Narsil",
                    imagem = "quiz_5_9"
                ),
                Pergunta(
                    id = "10",
                    texto = "Quem destrói o Um Anel, levando-o ao fogo da Montanha da Perdição?",
                    opcoes = listOf("Gollum", "Frodo", "Sam", "Aragorn").shuffled(),
                    respostaCorreta = "Gollum",
                    imagem = "quiz_5_10"
                )
            )
        )
    )
}

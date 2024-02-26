O contexto de negócio que escolhi para o meu projeto foi baseado em uma clínica médica. Criei uma primeira classe chamada "Paciente" para começar o sistema. Defini algumas regras de negócio que vão ser melhoradas nas próximas etapas:
A clínica terá várias especialidades. Inicialmente, defini dois atributos para representar as duas primeiras áreas:
"consultaCG" (clínico geral) e "consultaCardiologista" (cardiologista).

Todo paciente deve ter um número de prontuário. Sem ele, não é possível solicitar uma consulta.


A faixa etária do paciente também é um pré-requisito para solicitação de consulta. A clínica não atende pacientes de pediatria. Pessoas com idade igual ou inferior a 10 anos não podem ser atendidas.

A clínica possui uma regra para aplicar descontos, se o paciente possuir convênio, terá 40% de desconto.

A data de tratamento vai seguir o padrão "xx/xxxx" (mês/ano).


Métodos.
O programa possui três métodos iniciais:

solicitarConsulta: verifica os critérios de prontuário e idade.


"descontoClinicoGeral" e "descontoCardiologista": define qual será o valor da consulta, baseando-se na existência de convênio ou não.

Feature: Criação de proposta para a etapa de formalização
 # @severity=BLOCKER
  @severity=MINOR
 # @severity=TRIVIAL
 # @severity=critical




@testecontrato
    Scenario Outline: Validar o retorno dos contratos
    Given o usuario fez o request de path "/veiculos/contratos"
    When retornado status 200
    Then validar o campo '<valorqate>'

  Examples:
  |valorqate|
  |'qtde_total'|
  |'qtde_pagas'|




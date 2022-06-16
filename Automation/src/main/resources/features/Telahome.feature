#language: en

@web @home

	Feature: Validar home

  @CT=041
  Scenario: Testar se a tela do Facebook esta abrindo
    Given que esteja na pagina inicial home
    When clicar no icone facebook
    Then redirecionar para o facebook

  @CT=042
  Scenario: Testar se a tela do Youtube esta abrindo
    Given que esteja na pagina inicial home
    When clicar no icone Youtube
    Then redirecionar para o Youtube

  @CT=043
  Scenario: Testar se a tela do google esta abrindo
    Given que esteja na pagina inicial home
    When clicar no icone google
    Then redirecionar para o google

  @CT=044
  Scenario: Testar se a tela do Twitter esta abrindo
    Given que esteja na pagina inicial home
    When clicar no icone Twitter
    Then redirecionar para o Twitter

  @CT=045
  Scenario: Testar clique nos banners popular
    Given que esteja na pagina inicial home
    When clicar no botao popular
    Then verificar se o filtro dos produtos popular foi alterado

  @CT=046
  Scenario: Testar clique nos banners best sellers
    Given que esteja na pagina inicial home
    When clicar no botao best sellers
    Then verificar se o filtro dos produtos best foi alterado 

package gherkin.stepdefinition;

import io.cucumber.java.en.*;
import parametros.Operador;


public class MyStepdefs {


    Operador operador;

    public MyStepdefs() throws Exception {
    }
    @Given("o usuário criou uma proposta com {string}")
    public void oUsuarioCriouUmaPropostaComTipoVeiculo(String tipoVeic) throws Exception {


    }

    @When("Andar na esteira considerando o fluxo do lojista")
    public void andarNaEsteiraConsiderandoOFluxoDoLojista() throws Exception {
    }
    @Then("a proposta deve está no status Formalização Digital")
    public void aPropostaDeveEstaNoStatusFormalizacaoDigital() {
    //   Assert.assertEquals(modelAPISimulacaoVeiculo.valor("sasa"), true);
    }

    @And("step qualquer")
    public void stepQualquer() {
    }

    @Then("validar o campo {string}")
    public void validarOCampoValorqate() {
    }
}



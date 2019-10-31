package com.devBootCamp.exercicio1;

public class Endereco {
    private Integer id;
    private String rua;
    private String numero;
    private String bairro;
    private TipoEndereco tipoEndereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public void dadosEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Bairro " + bairro);
        System.out.println("Número: " + numero);
        System.out.println("Tipo Do Endereço: " + tipoEndereco.getLabel());
    }
}

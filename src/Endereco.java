public record Endereco (String cep, String logradouro, String complemento, String localidade, String uf) {

    @Override
    public String toString() {
        return "Endereco ( " +
                "cep = " + cep +
                ", logradouro = " + logradouro  +
                ", localidade = " + localidade +
                ", uf = " + uf + " )";
    }
}

# Consulta cep

Este é um projeto em Java que implementa uma API para consumir dados de CEPs de uma API pública. O projeto é estruturado de acordo com as seguintes classes principais:

## Estrutura do Projeto

1. **Classe GeradorDeArquivo:**
   - Responsável por instanciar o Gson Builder para manipulação de arquivos JSON.

2. **Classe ConsultaCep:**
   - Contém toda a lógica relacionada à consulta de CEPs.
   - Intera com a API pública para obter informações de CEP.
   - Utiliza a classe GeradorDeArquivo para salvar os dados obtidos.

3. **Record Endereco:**
   - Representa a estrutura de dados para armazenar informações de endereços.
   - Mapeia os dados do projeto.

4. **Classe Principal:**
   - Ponto de entrada do programa.
   - Instancia as classes necessárias (GeradorDeArquivo, ConsultaCep, etc.).
   - Cria a interface do usuário ou qualquer lógica relacionada à interação do usuário.

## Dependências Externas

- Gson: [Link para a biblioteca Gson](https://github.com/google/gson)

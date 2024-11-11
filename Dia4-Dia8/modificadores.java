// Modificadores de acesso
// Para classes:
    // public = Acessivel de qualquer lugar, em qualquer lugar do projeto.
    // default = Acessivel apenas dentro do mesmo pacote em que foi definida.
    
// Para atributos, metodos e contrutores:
    // public = Acessivel em qualquer parte do codigo.
    // private = acessivel apenas dentro da propria classe, encapsulando os dados.
    // default = Acessivel apenas dentro do mesmo pacote/arquivo.
    // protect = Acessivel dentro do pacote e em subclasses mesmo que estejam em pacotes diferentes.

// Modificadores de nao acesso
// Para classes:
    // final = Uma classe 'final' nao pode ser herdada, ou seja, nao podemos criar subclasses a partir dela.
    // abstract = Nao pode ser instanciada diretamente. Usamos ela como base para outras classes e geralmente define metodos abstratos que serao reutilizados por outras classes.
    
// Para atributos e metodos:
    // final = Nao pode ser alterado depois de iniciado, ou seja, vira uma constante.
    // static = O atributo ou metodo e compartilhado entre todas as instancias.
    // abstract = O metodo marcado como abstract nao tem implementacao na classe onde e declarado, sendo necessario ser implementado nas subclasses das classes abstratas.
    // transient = O atributo marcado como transient sera ignorado durante a serializacao, ou seja, ele nao sera gravado quando o objeto for convertido em um formato que pode ser armazenado como um JSON, XML e bin.
    // synchronized = Um metodo marcado como synchronized garante que apenas uma thread por vez possa executar o metodo. Isso e importante em contextos de concorrencia de processos.
    // volatile = Um atributo marcado como volatile e utilizado me ambientes multi-thread para garantir que o valor do atributo seja lido diretamente da memoria principal e nao de um cache da CPU. Ele ajuda a garantir a visibilidade do valor oara todas as threads.

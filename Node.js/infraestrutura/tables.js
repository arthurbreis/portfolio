class Tables {
    init(conexao) {
        this.conexao = conexao
        this.criarAtendimento()
    }

    criarAtendimento(){
        const sql = 'CREATE TABLE IF NOT EXISTS Atendimentos (id int NOT NULL AUTO_INCREMENT,\
             cliente varchar(50) NOT NULL, pet varchar(20), servico varchar(20) NOT NULL,\
             data varchar(255), dataCriacao datetime DEFAULT 0 ON UPDATE CURRENT_TIMESTAMP,\
             status varchar(20) NOT NULL,\
             observacoes text, PRIMARY KEY(id))'

            this.conexao.query(sql, erro => {
                if(erro) {
                    console.log(erro)
                } else {
                    console.log('Tabela Atendimentos criada com sucesso')
                }
            })
        }
    }
    module.exports = new Tables
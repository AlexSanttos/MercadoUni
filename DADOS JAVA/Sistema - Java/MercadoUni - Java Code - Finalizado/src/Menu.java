
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

//Construtor da classe Menu
    public Menu(String nome, String cargo) {
        initComponents();
        mnuADM.setVisible(false);

        // quem possui acessos aos menus abaixo
        if (cargo.equalsIgnoreCase("Diretor") || cargo.equalsIgnoreCase("DBA") || cargo.equalsIgnoreCase("Diretor de TI") || cargo.equalsIgnoreCase("Programador")) {
            mnuADM.setVisible(true);

            // quem não pode ter acesso aos menus abaixo
        } else if (cargo.equalsIgnoreCase("Programador")) {
            mnuProdutos.setEnabled(false);
            mnuClientes.setEnabled(false);
            mnuFinanceiro.setEnabled(false);
            

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenu();
        itmContratosAndamento = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuFinanceiro = new javax.swing.JMenu();
        itmOrcamentoGerais = new javax.swing.JMenuItem();
        itmRegulamentoFinanceiro = new javax.swing.JMenuItem();
        mnuADM = new javax.swing.JMenu();
        itmAlterarDadosUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuario = new javax.swing.JMenuItem();
        itmExcluirTodosusuarios = new javax.swing.JMenuItem();
        itmAdicionarUsuario = new javax.swing.JMenuItem();
        itmListaUsuario = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmChamadosTi = new javax.swing.JMenuItem();
        itmChamadosRh = new javax.swing.JMenuItem();

        setTitle("Menu do sistema");
        getContentPane().setLayout(null);

        lblSaudacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(450, 390, 350, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(790, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 480);

        barMenu.setBackground(new java.awt.Color(0, 0, 0));

        mnuProdutos.setText("Produtos");
        mnuProdutos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuProdutosMenuSelected(evt);
            }
        });

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosProdutos.setText("Estoque Geral");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRelatoriosProdutos);
        mnuProdutos.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        mnuProdutos.add(itmSair);

        barMenu.add(mnuProdutos);

        mnuClientes.setText("Clientes");

        itmContratosAndamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmContratosAndamento.setText("Contratos em Andamento");
        itmContratosAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContratosAndamentoActionPerformed(evt);
            }
        });
        mnuClientes.add(itmContratosAndamento);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Contratos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuClientes.add(jMenuItem1);

        barMenu.add(mnuClientes);

        mnuFinanceiro.setText("Financeiro");

        itmOrcamentoGerais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmOrcamentoGerais.setText("Menu Finanças");
        itmOrcamentoGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOrcamentoGeraisActionPerformed(evt);
            }
        });
        mnuFinanceiro.add(itmOrcamentoGerais);

        itmRegulamentoFinanceiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmRegulamentoFinanceiro.setText("Regulamento Financeiro");
        itmRegulamentoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegulamentoFinanceiroActionPerformed(evt);
            }
        });
        mnuFinanceiro.add(itmRegulamentoFinanceiro);

        barMenu.add(mnuFinanceiro);

        mnuADM.setText("ADM");

        itmAlterarDadosUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmAlterarDadosUsuario.setText("Alterar Dados do Usuário");
        itmAlterarDadosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarDadosUsuarioActionPerformed(evt);
            }
        });
        mnuADM.add(itmAlterarDadosUsuario);

        itmExcluirUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmExcluirUsuario.setText("Excluir Usuário");
        itmExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuarioActionPerformed(evt);
            }
        });
        mnuADM.add(itmExcluirUsuario);

        itmExcluirTodosusuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmExcluirTodosusuarios.setText("Excluir Todos os Usuários");
        mnuADM.add(itmExcluirTodosusuarios);

        itmAdicionarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmAdicionarUsuario.setText("Adicionar Usuário");
        itmAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdicionarUsuarioActionPerformed(evt);
            }
        });
        mnuADM.add(itmAdicionarUsuario);

        itmListaUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmListaUsuario.setText("Listar Usuario");
        itmListaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListaUsuarioActionPerformed(evt);
            }
        });
        mnuADM.add(itmListaUsuario);

        barMenu.add(mnuADM);

        mnuAjuda.setText("Ajuda");

        itmChamadosTi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itmChamadosTi.setText("Chamados de TI");
        itmChamadosTi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmChamadosTiActionPerformed(evt);
            }
        });
        mnuAjuda.add(itmChamadosTi);

        itmChamadosRh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itmChamadosRh.setText("Visualizar Chamados");
        itmChamadosRh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmChamadosRhActionPerformed(evt);
            }
        });
        mnuAjuda.add(itmChamadosRh);

        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(816, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void mnuProdutosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuProdutosMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuProdutosMenuSelected

    private void itmAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdicionarUsuarioActionPerformed
        TelaUsuario tela;
        tela = new TelaUsuario();
        tela.setVisible(true);


    }//GEN-LAST:event_itmAdicionarUsuarioActionPerformed

    private void itmChamadosRhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmChamadosRhActionPerformed
        VisualizarChamados tela;
        tela = new VisualizarChamados();
        tela.setVisible(true);
    }//GEN-LAST:event_itmChamadosRhActionPerformed

    private void itmContratosAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContratosAndamentoActionPerformed
        TelaCliente tela;
        tela = new TelaCliente();
        tela.setVisible(true);

    }//GEN-LAST:event_itmContratosAndamentoActionPerformed

    private void itmChamadosTiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmChamadosTiActionPerformed
        ChamadosTi tela;
        tela = new ChamadosTi();
        tela.setVisible(true);

    }//GEN-LAST:event_itmChamadosTiActionPerformed

    private void itmOrcamentoGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOrcamentoGeraisActionPerformed
        MenuFinancas tela;
        tela = new MenuFinancas();
        tela.setVisible(true);

    }//GEN-LAST:event_itmOrcamentoGeraisActionPerformed

    private void itmRegulamentoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegulamentoFinanceiroActionPerformed
        

    }//GEN-LAST:event_itmRegulamentoFinanceiroActionPerformed

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        TelaProdutos tela;
        tela = new TelaProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
// 1 - Solicitar o código do produto
        String u;
        u = JOptionPane.showInputDialog("Digite o codigo produto");
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produtos WHERE codigoproduto = ?");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o os dados do produto que veio na consulta ao banco de dados
                String codigoproduto, descricaoproduto, qtde, precounitario, precovenda;
                codigoproduto = resultado.getString("codigoproduto");
                descricaoproduto = resultado.getString("descricaoproduto");
                qtde = resultado.getString("qtde");
                precounitario = resultado.getString("precounitario");
                precovenda = resultado.getString("precovenda");
                //Abrir o formulário Menu.java
                TelaProdutos tela;
                tela = new TelaProdutos(codigoproduto, descricaoproduto, qtde, precounitario, precovenda);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }
            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
 // 1 - Solicitar o usuário a ser excluído
        String u;
        u = JOptionPane.showInputDialog("Digite o produto a excluir");
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produtos WHERE codigoproduto = ?");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o os dados do produto que veio na consulta ao banco de dados
                String codigoproduto, descricaoproduto, qtde, precounitario, precovenda;
                codigoproduto = resultado.getString("codigoproduto");
                descricaoproduto = resultado.getString("descricaoproduto");
                qtde = resultado.getString("qtde");
                precounitario = resultado.getString("precounitario");
                precovenda = resultado.getString("precovenda");
                //Abrir o formulário Menu.java
                TelaProdutos tela;
                tela = new TelaProdutos(codigoproduto, descricaoproduto, qtde, precounitario, precovenda);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }
            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }



    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
ListaProdutos tela;
tela = new ListaProdutos();
tela.setVisible(true);


    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

    private void itmExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuarioActionPerformed
        abrirTelaUsuario("Excluir");
    }//GEN-LAST:event_itmExcluirUsuarioActionPerformed

    private void itmListaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListaUsuarioActionPerformed
        ListaUsuario tela;
        tela = new ListaUsuario();
        tela.setVisible(true);

    }//GEN-LAST:event_itmListaUsuarioActionPerformed

    private void itmAlterarDadosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarDadosUsuarioActionPerformed
        abrirTelaUsuario("Alterar");
    }//GEN-LAST:event_itmAlterarDadosUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Cliente tela;
       tela = new Cliente();
       tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void abrirTelaUsuario(String operacao) {
// 1 - Solicitar o usuário a ser alterado
        String u;
        u = JOptionPane.showInputDialog(null, "Digite o usuário a " + operacao, "Usuário", 1);
        if (u == null) {
            return; //stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o nome e o cargo que veio na consulta ao banco de dados
                String usuario, senha, nome, cargo;
                usuario = resultado.getString("usuario");
                senha = resultado.getString("senha");
                nome = resultado.getString("nome");
                cargo = resultado.getString("cargo");
                //Abrir o formulário Menu.java
                TelaUsuario tela;
                tela = new TelaUsuario(usuario, senha, nome, cargo, operacao);
                tela.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }
            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JMenuItem itmAdicionarUsuario;
    private javax.swing.JMenuItem itmAlterarDadosUsuario;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmChamadosRh;
    private javax.swing.JMenuItem itmChamadosTi;
    private javax.swing.JMenuItem itmContratosAndamento;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmExcluirTodosusuarios;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmListaUsuario;
    private javax.swing.JMenuItem itmOrcamentoGerais;
    private javax.swing.JMenuItem itmRegulamentoFinanceiro;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuADM;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenu mnuFinanceiro;
    private javax.swing.JMenu mnuProdutos;
    // End of variables declaration//GEN-END:variables
}

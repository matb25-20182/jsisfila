package jsisfila;

public class Colegiado {
	public Colegiado() {
	}
	
	public Colegiado(String codigo, String nome) {
	}

	/**
	 * Vincula aluno a este colegiado
	 * @param aluno
	 */
	public void insereAluno(Aluno aluno) {
	}
	/**
	 * Retorna o aluno vinculado ao colegiado que possui a matrícula fornecida
	 * @param matricula Número de matrícula do aluno
	 * @return Objeto aluno ou null se não encontrar
	 */
	public Aluno findAluno(String matricula) {
		return null;
	}
	
	/**
	 * @return true se o código do colegiado é válido,
	 * ou false caso contrário
	 */
	public boolean isValido() {
		return false;
	}

	/**
	 * Indica a situação de um aluno na fila de atendimento
	 * @param matricula Número de matrícula do aluno
	 * @return
	 */
	public SituacaoNaFila situacaoNaFila(String matricula) {
		return null;
	}

	/**
	 * Adiciona aluno no final da fila
	 * @param matricula
	 * @throws EnfileiraException O aluno não puder ser adicionado à fila;
	 * use getSituacao() para saber a causa.
	 * @throws IllegalArgumentException O número de matrícula é inválido
	 * @throws NotFoundException O aluno não está vinculado a um colegiado
	 */
	public void enfileira(String matricula) throws EnfileiraException, IllegalArgumentException, NotFoundException {
	}
	/**
	 * Indica se a fila está vazia, i.e., se todos os alunos que estavam
	 * na fila já foram atendidos.
	 * @return
	 */
	public boolean filaVazia() {
		return false;
	}
	/**
	 * Indica a posição de um aluno na fila de atendimento
	 * @param matricula Número de matrícula do aluno
	 * @return 0, se o aluno está sendo atendido;
	 * número maior que 0, se o aluno está aguardando atendimento;
	 * -1 se o aluno já foi atendido ou nunca entrou na fila.
	 */
	public int posicaoAluno(String matricula) {
		return 0;
	}
	/**
	 * Chama a próximo aluno da fila
	 * @return O aluno que era o próximo da fila ou
	 * null se todos já haviam sido atendidos
	 */
	public Aluno chamaProximo() {
		return null;
	}
	/**
	 * @return O aluno que está sendo atendido ou
	 * null se todos os alunos já foram atendidos.
	 */
	public Aluno alunoEmAtendimento() {
		return null;
	}

	/**
	 * @return Quantidade de alunos atendidos ou em atendimento
	 */
	public int totalAlunosAtendidos() {
		return 0;
	}
	/**
	 * @return Quantidade de atendimentos realizados ou em andamento
	 */
	public int totalAtendimentosRealizados() {
		return 0;
	}
	/**
	 * @return Quantidade de alunos na fila aguardando atendimento
	 */
	public int totalAtendimentosFuturos() {
		return 0;
	}
	
	///////// getters e setters //////////////
	
	public String getCodigo() {
		return null;
	}
	public void setCodigo(String codigo) {
	}
	public String getNome() {
		return null;
	}
	public void setNome(String nome) {
	}
}

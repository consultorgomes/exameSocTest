/**
 * Validação do Formulário
 * @author Antônio Gomes Jr
 */

function validar(){
	//teste 
//	alert('test')
	
	let nome = frmExame.nome.value
	let exame = frmExame.exame.value
	let data = frmExame.data.value
	//let date = New Date()
	if (nome === "") {
		alert("Preencha o campo Nome do Paciente")
		frmExame.nome.focus()
		return false
	}else if (exame ===""){
		alert("Preencha o campo Nome do Exame ")
		frmExame.exame.focus()
		return false		
	}else if (data ==="" /*verificar com a data atual tem que ser maior*/){
		alert("Preencha o campo Data do Exame ")
		frmExame.data.focus()
		return false		
	}else if (data ==="" /*verificar com a data atual tem que ser maior*/){
		alert("Preencha uma data maior que o dia de Hoje")
		frmExame.data.focus()
		return false		
	} else {
		document.forms["frmExame"].submit()
	}	
	
}
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>cerveja.biz - Criar Empresa</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Barra superior com os menus de navegacao -->
	<c:import url="Menu.jsp"/>
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Incluir Empresa</h3>
        <!-- Formulario para inclusao de empresas -->
        <form action="ManterEmpresa.do" method="post">
            <!-- area de campos do form -->
            <div class="row">
                <div class="form-group col-md-12">
                    <label for="cnpj">Cnpj</label>
                    <input type="text" class="form-control" name="cnpj" id="cnpj" required maxlength="100" placeholder="cnpj completo">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-md-6">
                    <label for="razaoSocial">Razao Social</label>
                    <input type="text" class="form-control" name="razaoSocial" id="razaoSocial" maxlength="50" placeholder="Razao Social completa">
                </div>

                <div class="form-group col-md-6">
                    <label for="conjunto">Conjunto</label>
                    <input type="text" class="form-control" name="conjunto" id="conjunto" required maxlength="60" placeholder="conjunto obrigatório">
                </div>
                
                <div class="form-group col-md-6">
                    <label for="horarioDeFuncionamento">Horario de funcionamento</label>
                    <input type="text" class="form-control" name="horarioDeFuncionamento" id="horarioDeFuncionamento" required maxlength="60" placeholder="horario De Funcionamento obrigatório">
                </div>
                
                 <div class="form-group col-md-6">
                    <label for="temperaturaDoArCondicionado">Temperatura do ar condicionado</label>
                    <input type="text" class="form-control" name="temperaturaDoArCondicionado" id="temperaturaDoArCondicionado" required maxlength="60" placeholder="Temperatura do ar condicionado obrigatório">
                </div>
                
                <div class="form-group col-md-6">
                    <label for="horarioDoArCondicionado">Horario do ar condicionado</label>
                    <input type="text" class="form-control" name="horarioDoArCondicionado" id="horarioDoArCondicionado" required maxlength="60" placeholder="Horario do ar condicionado obrigatório">
                </div>
            </div>
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-primary" name="acao" value="Criar">Salvar</button>
                    <button type="reset" class="btn btn-primary" name="acao" value="excluir">Deletar</button>
                    <a href="index.html" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>
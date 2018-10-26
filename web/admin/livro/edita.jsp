<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<div class="card">
    <div class="card-header">
        <h5 class="title">Adiciona Livro</h5>
    </div>
    <div class="card-body">
        <!--MODIFICAR PARA ADD-->
        <form action="UploadWS" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="urldestino" value="LivroWS">
            <div class="row">
                <div class="col-md-3 pr-md-1">
                    <div class="form-group">
                        <label>Id</label>
                        <input type="text" class="form-control" name="txtId" placeholder="Id" value="${obj.id}" readonly="true">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" name="txtNome" required class="form-control" placeholder="Nome" value="${obj.nome}">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Data</label>
                        <input type="date" name="txtData" required class="form-control" placeholder="Data" value="${obj.mostraData2()}">
                    </div>
                </div>
            </div>
            <div class="row">
                <select name="txtEditora">
                    <option>selecione</option>
                    <c:forEach items="${listaEditora}" var="editora">
                        <option value="${editora.id}"<c:if test="${editora.id==obj.editora.id}">selected </c:if>>${editora.nome}"></option>
                    </c:forEach>>
                </select>
            </div>
            <div class="row">
                <select name="txtAutor">
                    <option>selecione</option>
                    <c:forEach items="${listaAutor}" var="autor">
                        <option value="${autor.id}"<c:if test="${autor.id==obj.autor.id}">selected </c:if>>${autor.nome}"></option>
                    </c:forEach>>
                </select>
            </div>
            <div class="row">
                <select name="txtGenero">
                    <option >selecione</option>
                    <c:forEach items="${listaGenero}" var="genero">
                        <option value="${genero.id}"<c:if test="${genero.id==obj.genero.id}">selected </c:if>>${genero.genero}"></option>
                    </c:forEach>>
                </select>
            </div>
            <div class="row">
                <select name="txtClassificacao">
                    <option >selecione</option>
                    <c:forEach items="${listaClassificacao}" var="classificacao">
                        <option value="${classificacao.id}"<c:if test="${classificacao.id==obj.classificacao.id}">selected </c:if>>${classificacao.classificacao}"></option>
                    </c:forEach>>
                </select>
            </div>
            <div class="row">

                <div class="col-md-7">
                    <div class="form-group-file">
                        <label for="file">Foto</label>
                        <input type="file" id="file" name="txtFoto" required class="form-control form-control-file" value="./../../arquivos/${obj.endFoto}">
                    </div>
                </div>
            </div>
            <button class="btn btn-primary btn-round text-center" type="submit">
                <i class="tim-icons icon-cloud-upload-94"></i> Salvar
            </button>
            <a class="btn btn-primary btn-round text-center" href="LivroWS?acao=list">
                <i class="tim-icons icon-bullet-list-67"></i> Listar
            </a>
        </form>
    </div>
    <div class="card-footer">
        <c:if test = "${not empty msg}">
            <div class="alert alert-primary alert-dismissible fade show" role="alert">
                ${msg}
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <i class="tim-icons icon-simple-remove"></i>
                </button>
            </div>
        </c:if>
    </div>
</div>
</div>
<%@include file="../rodape.jsp" %>
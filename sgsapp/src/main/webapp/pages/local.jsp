<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="../commons/include.jsp" %>

<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7">
        <title>SGSWEB - Gesti�n de Locales</title>
        <link href="images/favicon.ico" rel="shortcut icon" type="image/x-icon">
        <link href="images/favicon.ico" rel="icon" type="image/x-icon">
        <link type="text/css" rel="stylesheet" href="../css/mycss.css">
        <script type="text/javascript" src="../js/general.js"></script>
    </head>
    <f:loadBundle var="par" basename="pe.com.segrop.sgs.resources.parameters"/>
    <body>
        <f:view>
            <%@include file="../commons/header.jsp" %>
            <h:form id="localForm">
                <rich:panel header="GESTION DE LOCALES" style="font-size: 13px;">
                    <fieldset>
                        <legend style="font-size: 11px;font-weight: bold;">Criterios de B�squeda</legend>
                        <h:panelGrid columns="2" width="100%" columnClasses="columnLbl1, columnTxt1">
                            <h:outputText value="Empresa: " styleClass="Etiqueta1"/>
                            <h:selectOneMenu value="#{localMB.searchEmpresa}" style="float: left;font-size: 11px"> 
                                <f:selectItems value="#{listasSessionMB.listaEmpresaActiva}"/>
                            </h:selectOneMenu>

                            <h:outputText value="Nombre: " styleClass="Etiqueta1" />
                            <h:inputText value="#{localMB.searchDescripcion}" size="50" maxlength="100" style="float: left;font-size: 11px;text-transform: uppercase;" />
                            <%--
                            <p:autoComplete value="#{localMB.searchDescripcion}" completeMethod="#{localMB.completeDescripcion}" var="p" itemLabel="#{p.label}" 
                                            itemValue="#{p.label}" forceSelection="true" size="100" maxlength="100" maxResults="5" style="float: left;font-size: 11px;text-transform: uppercase;"/>
                            --%>
                        </h:panelGrid>
                        <h:panelGrid columns="1">
                            <h:panelGroup>
                                <a4j:commandButton id="btnBuscar" value="Buscar" actionListener="#{localMB.buscarLocal}" reRender="tbl" style="font-size: 11px;height: 2em"/>
                                <a4j:commandButton id="btnNuevo" value="Nuevo" actionListener="#{localMB.toRegistrar}" reRender="dlgMsgs empresa descripcion" style="font-size: 11px;height: 2em">
                                    <rich:componentControl for="dlg" attachTo="btnNuevo" operation="show" event="onclick"/>
                                </a4j:commandButton>
                            </h:panelGroup>
                        </h:panelGrid>
                    </fieldset>

                    <fieldset>
                        <legend style="font-size: 11px;font-weight: bold;">Listado de Locales</legend>
                        <rich:messages id="tblMsgs" showSummary="true" showDetail="true"/>
                        <rich:dataTable id="tbl" var="row" value="#{localMB.listaLocal}" rows="10" style="font-size: 11px;" width="100%">
                            <f:facet name="header">
                                <rich:datascroller for="tbl" maxPages="15"/>
                            </f:facet>
                            <rich:column>
                                <f:facet name="header">
                                    <h:outputText value="EMPRESA" style="font-size: 11px;"/>
                                </f:facet>
                                <h:outputText value="#{row.id.NCodEmpresa}" style="font-size: 11px;font-weight: normal;">
                                    <f:converter converterId="converterEmpresa"/>
                                </h:outputText>
                            </rich:column>
                            <rich:column>
                                <f:facet name="header">
                                    <h:outputText value="LOCAL" style="font-size: 11px;"/>
                                </f:facet>
                                <h:outputText value="#{row.VDescripcion}" style="font-size: 11px;font-weight: normal;"/>
                            </rich:column>                            
                            <rich:column style="text-align: center;">
                                <f:facet name="header">
                                    <h:outputText value="ACTIVO" style="font-size: 11px;"/>
                                </f:facet>
                                <h:outputText value="#{row.NFlgActivo}" style="font-size: 11px;font-weight: normal;">
                                    <f:converter converterId="converterSiNo"/>
                                </h:outputText>
                            </rich:column>
                            <rich:column title="" style="text-align: center;">
                                <f:facet name="header">
                                    <h:outputText value="ACCIONES" style="font-size: 11px;"/>
                                </f:facet>
                                <a4j:commandLink id="elink" actionListener="#{localMB.toEditar}" reRender="gridEdit">
                                    <f:setPropertyActionListener value="#{row}" target="#{localMB.selectedItem}"/>
                                    <rich:componentControl for="dlgEdit" attachTo="elink" operation="show" event="onclick"/>
                                    <h:graphicImage style="border: 0;" url="/pages/images/pencil.png" alt="editar local" title="editar local"/>
                                </a4j:commandLink>
                                <rich:spacer width="5"/>
                                <a4j:commandLink id="dlink" rendered="#{row.NFlgActivo==1}" >
                                    <f:setPropertyActionListener value="#{row}" target="#{localMB.selectedItem}"/>
                                    <rich:componentControl for="cdlg" attachTo="dlink" operation="show" event="onclick"/>
                                    <h:graphicImage style="border: 0;" url="/pages/images/cross.png" alt="desactivar local" title="desactivar local"/>
                                </a4j:commandLink>
                                <a4j:commandLink id="alink" rendered="#{row.NFlgActivo==0}">
                                    <f:setPropertyActionListener value="#{row}" target="#{localMB.selectedItem}"/>
                                    <rich:componentControl for="cadlg" attachTo="alink" operation="show" event="onclick"/>
                                    <h:graphicImage style="border: 0;" url="/pages/images/tick.png" alt="activar local" title="activar local"/>
                                </a4j:commandLink>
                            </rich:column>
                        </rich:dataTable>
                    </fieldset>
                </rich:panel>
            </h:form>
            <rich:modalPanel id="dlg" resizeable="false" moveable="false" autosized="true" width="500">
                <f:facet name="header">
                    <h:panelGroup>
                        <h:outputText value="NUEVO LOCAL"></h:outputText>
                    </h:panelGroup>
                </f:facet>
                <h:form id="dlgForm">
                    <rich:messages id="dlgMsgs" showSummary="true" showDetail="true" errorClass="msgError" errorLabelClass="msgLabelError">
                        <f:facet name="errorMarker">
                            <h:graphicImage style="border: 0;" url="/pages/images/messagebox_critical.png"/>
                        </f:facet>
                        <f:facet name="infoMarker">
                            <h:graphicImage style="border: 0;" url="/pages/images/messagebox_info.png"/>
                        </f:facet>
                        <f:facet name="warnMarker">
                            <h:graphicImage style="border: 0;" url="/pages/images/messagebox_warning.png"/>
                        </f:facet>
                    </rich:messages>
                    <h:panelGrid columns="2" style="margin-bottom:10px">
                        <h:outputLabel for="empresa" value="Empresa: " styleClass="Etiqueta1" rendered="#{loginMB.empresa eq par.rucSegrop}"/>
                        <h:selectOneMenu id="empresa" value="#{localMB.empresa}" style="float: left;font-size: 11px" >
                            <f:selectItems value="#{listasSessionMB.listaEmpresaActiva}"/>
                        </h:selectOneMenu>

                        <h:outputLabel for="descripcion" value="Descripci�n: " styleClass="Etiqueta1"/>
                        <h:inputText id="descripcion" value="#{localMB.descripcion}" size="50" maxlength="100" style="float: left;font-size: 11px;text-transform: uppercase;" />
                    </h:panelGrid>

                    <h:panelGroup>
                        <a4j:commandButton id="btnGrabar" value="Grabar" onclick="confirmDlg.show();" style="font-size: 11px;height: 2em">
                            <rich:componentControl for="confirmDlg" attachTo="btnGrabar" operation="show" event="onclick"/>
                        </a4j:commandButton>
                        <a4j:commandButton id="btnCancelar" value="Cancelar" onclick="dlg.hide();" style="font-size: 11px;height: 2em">
                            <rich:componentControl for="dlg" attachTo="btnCancelar" operation="hide" event="onclick"/>
                        </a4j:commandButton>
                    </h:panelGroup>
                </h:form>
            </rich:modalPanel>
            <rich:modalPanel id="confirmDlg" height="100" keepVisualState="true" resizeable="false">
                <f:facet name="header">
                    <h:panelGroup>
                        <h:outputText value="Confirmaci�n"></h:outputText>
                    </h:panelGroup>
                </f:facet>
                <h:form id="confirmDlgForm">
                    <h:outputText value="Se proceder� a registrar el local." style="font-size: 11px;"/><br/>
                    <h:outputText value="Desea Continuar?" style="font-size: 11px;"/><br/>
                    <hr>
                    <a4j:commandButton id="btnSi" value="SI" reRender="dlgMsgs" actionListener="#{localMB.registrarLocal}" oncomplete="#{localMB.action}" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="confirmDlg" attachTo="btnSi" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                    <a4j:commandButton id="btnNo" value="NO" type="button" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="confirmDlg" attachTo="btnNo" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                </h:form>
            </rich:modalPanel>
            <rich:modalPanel id="dlgEdit" resizeable="false" moveable="false" autosized="true" width="500">
                <f:facet name="header">
                    <h:panelGroup>
                        <h:outputText value="EDITAR LOCAL"></h:outputText>
                    </h:panelGroup>
                </f:facet>
                <h:form id="dlgEditForm">
                    <rich:messages id="dlgEditMsgs" showSummary="true" showDetail="true" errorClass="msgError" errorLabelClass="msgLabelError">
                        <f:facet name="errorMarker">
                            <h:graphicImage style="border: 0;" url="/pages/images/messagebox_critical.png"/>
                        </f:facet>
                        <f:facet name="infoMarker">
                            <h:graphicImage style="border: 0;" url="/pages/images/messagebox_info.png"/>
                        </f:facet>
                        <f:facet name="warnMarker">
                            <h:graphicImage style="border: 0;" url="/pages/images/messagebox_warning.png"/>
                        </f:facet>
                    </rich:messages>
                    <h:panelGrid id="gridEdit" columns="2" style="margin-bottom:10px">
                        <h:outputLabel for="empresaedit" value="Empresa: " styleClass="Etiqueta1" />
                        <h:selectOneMenu id="empresaedit" value="#{localMB.selectedItem.id.NCodEmpresa}" style="float: left;font-size: 11px" >
                            <f:selectItems value="#{listasSessionMB.listaEmpresaActiva}"/>
                        </h:selectOneMenu>

                        <h:outputLabel for="descripcionedit" value="Descripci�n: " styleClass="Etiqueta1"/>
                        <h:inputText id="descripcionedit" value="#{localMB.selectedItem.VDescripcion}" size="50" maxlength="100" style="float: left;font-size: 11px;text-transform: uppercase;" />
                    </h:panelGrid>

                    <h:panelGroup>
                        <a4j:commandButton id="btnGrabar_" value="Grabar" onclick="confirmEditDlg.show();" style="font-size: 11px;height: 2em">
                            <rich:componentControl for="confirmEditDlg" attachTo="btnGrabar_" operation="show" event="onclick"/>
                        </a4j:commandButton>
                        <a4j:commandButton id="btnCancelar_" value="Cancelar" onclick="dlgEdit.hide();" style="font-size: 11px;height: 2em">
                            <rich:componentControl for="dlgEdit" attachTo="btnCancelar_" operation="hide" event="onclick"/>
                        </a4j:commandButton>
                    </h:panelGroup>
                </h:form>
            </rich:modalPanel>
            <rich:modalPanel id="confirmEditDlg" height="100" keepVisualState="true" resizeable="false">
                <f:facet name="header">
                    <h:panelGroup>
                        <h:outputText value="Confirmaci�n"></h:outputText>
                    </h:panelGroup>
                </f:facet>
                <h:form id="confirmEditDlgForm">
                    <h:outputText value="Se proceder� a editar el local." style="font-size: 11px;"/><br/>
                    <h:outputText value="Desea Continuar?" style="font-size: 11px;"/><br/>
                    <hr>
                    <a4j:commandButton id="btnSi_" value="SI" reRender="dlgEditMsgs, tbl" actionListener="#{localMB.editarLocal}" oncomplete="#{localMB.action}" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="confirmEditDlg" attachTo="btnSi_" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                    <a4j:commandButton id="btnNo_" value="NO" type="button" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="confirmEditDlg" attachTo="btnNo_" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                </h:form>
            </rich:modalPanel>
            <rich:modalPanel id="cdlg" height="100" keepVisualState="true" resizeable="false">
                <f:facet name="header">
                    <h:outputText value="Desactivaci�n del Local"></h:outputText>
                </f:facet>
                <h:form id="mpdForm">
                    <h:outputText value="Se proceder� a desactivar el local."/><br/>
                    <h:outputText value="Desea Continuar?"/><br/>
                    <hr>
                    <a4j:commandButton id="dbtnSI" value="SI" reRender="tbl" actionListener="#{localMB.desactivar}" status="commonstatus" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="cdlg" attachTo="dbtnSI" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                    <a4j:commandButton id="dbtnNO" value="NO" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="cdlg" attachTo="dbtnNO" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                </h:form>
            </rich:modalPanel>
            <rich:modalPanel id="cadlg" height="100" keepVisualState="true" resizeable="false">
                <f:facet name="header">
                    <h:outputText value="Activaci�n del Local"></h:outputText>
                </f:facet>
                <h:form id="mpaForm">
                    <h:outputText value="Se proceder� a activar el local."/><br/>
                    <h:outputText value="Desea Continuar?"/><br/>
                    <hr>
                    <a4j:commandButton id="dbtnSI" value="SI" reRender="tbl" actionListener="#{localMB.activar}" status="commonstatus" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="cadlg" attachTo="dbtnSI" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                    <a4j:commandButton id="dbtnNO" value="NO" style="font-size: 11px;height: 2em">
                        <rich:componentControl for="cadlg" attachTo="dbtnNO" operation="hide" event="onclick"/>
                    </a4j:commandButton>
                </h:form>
            </rich:modalPanel>
            <rich:spacer />
            <%@include file="../commons/footer.jsp" %>
        </f:view>
    </body>
</html>

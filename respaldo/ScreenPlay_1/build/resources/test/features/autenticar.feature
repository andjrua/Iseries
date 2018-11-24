# language: es

@tag
Característica: Autenticar
  Yo como usuario quiero autenticarme para validar mis credenciales


Escenario: Autenticar
	Dado que me autentico con usuario CJUCRESTR y contraseña RESTREJ36
	Cuando realizo una consulta en SQL para el miembro ST12182929 
	Entonces deberia ver el estado del miembro igual a K
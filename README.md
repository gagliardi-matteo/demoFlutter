Nome del progetto: "VANNACCI-ASK"

Descrizione:
	Basic Social media app, where you can ask to Vannacci a deep and antropological question.



TECHNOLOGIES

Auth -> tabella utenti su DB proprietario, con Oauth2

Post -> (n-1) utente_id, String descrizione, String nullble luogo, int like

Post_utentiTaggati -> post_id, utente_id (n-n)

Post_Immaigni -> Post_id, Image_path (post-image -> 1-n)

CHIEDILO A VANNACCI (pagina di domande con chatgpt api)



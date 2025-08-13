import smtplib  # biblioteca para envio de emails via SMTP
from email.mime.multipart import MIMEMultipart  # estrutura de email com múltiplas partes (texto, anexo, etc.)
from email.mime.text import MIMEText  # estrutura de email com texto simples (plain text)

# === Configurações do servidor SMTP ===
server = 'smtp.gmail.com'
port = 587  # porta para conexão com STARTTLS
username = "gabriellosekannpm@gmail.com"
password = "djwysaujlgqhsoxq"  # senha de app do Gmail (não é a senha normal da conta)

# === Dados do e-mail ===
mail_from = "gabriellosekannpm@gmail.com"
mail_to = "gabriellosekannpm@gmail.com"
mail_subject = "TSI - 17/08/2021"
mail_body = "Olá Mundo, Python é Legal!!"

# === Criação do e-mail MIME ===
mensagem = MIMEMultipart()
mensagem['From'] = mail_from
mensagem['To'] = mail_to
mensagem['Subject'] = mail_subject
mensagem.attach(MIMEText(mail_body, 'plain'))

# === Conexão e envio ===
try:
    connection = smtplib.SMTP(server, port)
    connection.starttls()  # inicia a criptografia STARTTLS
    connection.login(username, password)  # autenticação
    connection.send_message(mensagem)  # envia o e-mail
    print("Email enviado com sucesso!")
except Exception as e:
    print(f"Erro ao enviar o email: {e}")
finally:
    connection.quit()  # encerra a conexão

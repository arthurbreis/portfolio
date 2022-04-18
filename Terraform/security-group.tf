resource "aws_security_group" "acesso-ssh" {

  name        = "acesso-ssh"
  description = "acesso-ssh"

  ingress {
    description      = "Acesso SSH"
    from_port        = 22
    to_port          = 22
    protocol         = "tcp"
    cidr_blocks      = var.cdirs_acess_allow
  }

  tags = {
    Name = "ssh"
  }
}

resource "aws_security_group" "acesso-ssh-us-east-2" {
  provider = aws.us-east-2
  name        = "acesso-ssh-us-east-2"
  description = "acesso-ssh-us-east-2"

  ingress {
    description      = "Acesso SSH"
    from_port        = 22
    to_port          = 22
    protocol         = "tcp"
    cidr_blocks      = var.cdirs_acess_allow
  }

  tags = {
    Name = "ssh"
  }
}
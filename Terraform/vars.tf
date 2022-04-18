variable "amis" {
    type = map
    default = {
       "us-east-1" = "ami-0e472ba40eb589f49"
       "us-east-2" = "ami-0fb653ca2d3203ac1"
    }
  
}

variable "cdirs_acess_allow" {
    type = list
    default = ["179.218.1.200/32" , "178.218.1.200/32"]
}

variable "key_name" {
    default = "terraform-aws"
  
}
variable "instance_type" {
    default = "t2.micro"
}
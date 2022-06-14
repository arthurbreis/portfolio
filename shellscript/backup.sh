#!/bin/bash

INICIO=`date +%d/%m/%Y-%H:%M:%S`
LOG=/var/log/bkpftp/`date +%Y-%m-%d`_BACKUP_FTP.txt

echo " " >> $LOG
echo " " >> $LOG
echo "| ------ ------ ------ ------ ------ ------ -----------"  >> $LOG
echo "  Sincronizacao iniciada em $INICIO" >> $LOG


rsync -razp /mnt/ftpdata/ /mnt/ftpbackup/ >> $LOG
FINAL=`date +%d/%m/%Y-%H:%M:%S`


echo "  Sincronizacao Finalizada em $FINAL" >> $LOG
echo "| ------ ------ ------ ------ ------ ------ -----------"  >> $LOG
echo " " >> $LOG
echo " " >> $LOG

sendEmail -t "inserir email remetente" -f "email destinatario" -m "Backup FTP JF Concluido $FINAL" -u "Backup FTP JF"

# Configurações personalizadas para uso do K8S
# Alias shell K8s:
# https://ahmet.im/blog/kubectl-aliases
# Configuração auto-complete:
# https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/#enable-shell-autocompletion
# /bin/bash
 
cat <<'EQF' >> ~/.bashrc
ms='minikube start'
alias k='kubectl'
alias ka='kubectl apply -f'
alias klog='kubectl logs -f'
alias kp='kubectl proxy'
alias kg='kubectl get'
alias kd='kubectl describe'
alias krm='kubectl delete'
alias kgpo='kubectl get pods'
alias kdpo='kubectl describe pods'
alias krmpo='kubectl delete pods'
alias kgdep='kubectl get deployment'
alias kddep='kubectl describe deployment'
alias krmdep='kubectl delete deployment'
alias kgsvc='kubectl get service'
alias kdsvc='kubectl describe service'
alias krmsvc='kubectl delete service'
alias kging='kubectl get ingress'
alias kding='kubectl describe ingress'
alias krming='kubectl delete ingress'
alias kgcm='kubectl get configmap'
alias kdcm='kubectl describe configmap'
alias krmcm='kubectl delete configmap'
alias kgsec='kubectl get secret'
alias kdsec='kubectl describe secret'
alias krmsec='kubectl delete secret'
alias kgno='kubectl get nodes'
alias kdno='kubectl describe nodes'
alias kgns='kubectl get namespaces'
alias kdns='kubectl describe namespaces'
alias krmns='kubectl delete namespaces'
source <(kubectl completion bash)
EQF

kubectl completion bash | sudo tee /etc/bash_completion.d/kubectl > /dev/null


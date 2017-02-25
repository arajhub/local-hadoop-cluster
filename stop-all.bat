@ECHO OFF 
start vmrun stop "C:\work\VMs\Virtual Machines\Local_HUE\Local_HUE.vmx"
TIMEOUT /T 5
start vmrun stop "C:\work\VMs\Virtual Machines\Local_Hadoop_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 5
start vmrun stop "C:\work\VMs\Virtual Machines\Local_DataNode1_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 5
start vmrun stop "C:\work\VMs\Virtual Machines\Local_DataNode2_64-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 5
start vmrun stop "C:\work\VMs\Virtual Machines\Local_DataNode3-bit\Local_Hadoop_64-bit.vmx"
TIMEOUT /T 5
start vmrun stop "C:\work\VMs\Virtual Machines\Local_DataNode4_64-bit\Local_Hadoop_64-bit.vmx"

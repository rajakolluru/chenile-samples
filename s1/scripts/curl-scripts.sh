display_cmd=cat
which jq && display_cmd=jq # if jq is present in path use jq to format the json payload well

function execute(){
	cmd="curl $1"
	header="curl -i $1"
	echo "Command: curl $1" | tr -d '\n' | tr '\t' ' ' | tr -s ' ' # all newlines ignored. all tabs to spaces. fuse multiple spaces to one space
	echo
	echo "---------------------------------------" 
	# eval $header 2> /dev/null | sed -n '/^[A-Za-z-]*:/p' # print only lines that have a word in the beginning (word can include -)
	echo 
	eval $cmd 2> /dev/null | $display_cmd
	echo "---------------------------------------" 
}

execute localhost:8080/info 

#----
json1='
  {
   
  }
'


execute  "-X POST -d '${json1}' -H 'Content-Type: application/json' -H 'x-chenile-region-id: US' localhost:8080/s1/op1"

execute "-X GET -H 'Content-Type: application/json' localhost:8080/health-check/s1Service"

execute "-X GET -H 'Content-Type: application/json' localhost:8080/service-info/s1Service"

import React, Component from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default class Module extends Component{ 
 
state = { 
module:[
	{title: 'Itil v5', data: [
	{id: Math.random(),moduleContent: 'Estratégia de serviço',subModuleContent: 'Module I', concept: []},
	{id: Math.random(),moduleContent: 'Operação de Serviço',subModuleContent: 'Module II', },]},
	{title: 'Cobit 5', },
]
}
render() { 

return( 
	<View >
 		<SectionList sections={state.module} keyExtractor={(item, index) => `${item.id}`} 
renderSelectionHeader={({ section }) => ( <HeaderModule title={section.title}/>)} 
renderItem={({ item }) => (<ContentModule key={item.id} {...item} moduleToConcept={moduleToConcept} />)}/>
 	</View>
)}

import React, Component from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default class ContentModule extends Component{ 
 
render() { 

return( 
	<View style = {styles.container}>
 	<View style = {styles.modules}>
 		<TouchableOpacity onPress={()=> this.props.moduleToConcept(this.props.id)}>
 		<Text > {this.props.moduleContent} </Text> 
		<Text > {this.props.subModuleContent} </Text> 
 		</TouchableOpacity> 
 	</View>
	<View style = {styles.icons}>
 		<Icon name='pencil-square-o' size={35} color='black' style={{null}} /> 
		<Icon name='list' size={35} color='black' style={{null}} /> 
 	</View>
 	</View>
)}
const styles = create ({
	container: {
 	}, 	

	modules: {
 	}, 	

	icons: {
 	}, 	
})
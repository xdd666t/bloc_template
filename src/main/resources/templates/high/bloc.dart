import 'package:bloc/bloc.dart';

import 'event.dart';
import 'state.dart';

class $nameBloc extends Bloc<$nameEvent, $nameState> {
  $nameBloc() : super($nameState().init());

  @override
  Stream<$nameState> mapEventToState($nameEvent event) async* {
    if (event is InitEvent) {
      yield await init();
    }
  }

  Future<$nameState> init() async {
    return state.clone();
  }
}
